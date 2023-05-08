package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

Job job1;
Job job2;


@Before
public void createTestData(){
    job1 = new Job();
    job2 = new Job();

}


    @Test
public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }




@Test
    public void testJobConstructorSetsAllFields(){

    Job testjob = new Job("Product tester" , new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertTrue(testjob instanceof Job);
    assertEquals( testjob.getName(), "product tester");
    assertTrue(testjob.getEmployer() instanceof Employer);
    assertEquals(testjob.getEmployer().getValue(), "ACME");
    assertTrue(testjob.getLocation() instanceof Location);
    assertEquals( testjob.getLocation().getValue(), "Desert");
    assertTrue(testjob.getPositionType() instanceof PositionType);
    assertEquals( testjob.getPositionType().getValue(), "Quality control");
    assertTrue(testjob.getCoreCompetency() instanceof CoreCompetency);
    assertEquals( testjob.getCoreCompetency().getValue(), "Persistence");
}

    @Test
    public void testJobsForEquality(){
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(jobA.equals(jobB));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char lett[] = testJob.toString().toCharArray();
        assertEquals('\n', lett[lett.length-1]);
        assertEquals('\n', lett[0]);

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String answer = "\nID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" +
                "Employer: " + job.getEmployer() + "\n" +
                "Location: " + job.getLocation() + "\n" +
                "Position Type: " + job.getPositionType() + "\n" +
                "Core Competency: " + job.getCoreCompetency() + "\n";
        assertEquals(job.toString(), answer);
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String answer = "\nID: " + job.getId() + "\n" +
                "Name: " + job.getName() + "\n" +
                "Employer: " + job.getEmployer() + "\n" +
                "Location: " + job.getLocation() + "\n" +
                "Position Type: " + job.getPositionType() + "\n" +
                "Core Competency: "+ job.getCoreCompetency() + "\n";
        assertEquals(job.toString(), answer);
    }

}

