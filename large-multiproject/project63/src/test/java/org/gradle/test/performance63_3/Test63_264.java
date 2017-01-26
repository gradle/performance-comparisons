package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_264 {
    private final Production63_264 production = new Production63_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}