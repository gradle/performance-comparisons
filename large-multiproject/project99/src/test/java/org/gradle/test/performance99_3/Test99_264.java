package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_264 {
    private final Production99_264 production = new Production99_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}