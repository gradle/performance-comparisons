package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_264 {
    private final Production5_264 production = new Production5_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}