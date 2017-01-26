package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_264 {
    private final Production78_264 production = new Production78_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}