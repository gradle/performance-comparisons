package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_264 {
    private final Production73_264 production = new Production73_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}