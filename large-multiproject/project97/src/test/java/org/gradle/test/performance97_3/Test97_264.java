package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_264 {
    private final Production97_264 production = new Production97_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}