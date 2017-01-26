package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_264 {
    private final Production45_264 production = new Production45_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}