package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_264 {
    private final Production26_264 production = new Production26_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}