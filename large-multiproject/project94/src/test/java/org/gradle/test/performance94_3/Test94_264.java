package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_264 {
    private final Production94_264 production = new Production94_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}