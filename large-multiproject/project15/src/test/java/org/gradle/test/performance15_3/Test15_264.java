package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_264 {
    private final Production15_264 production = new Production15_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}