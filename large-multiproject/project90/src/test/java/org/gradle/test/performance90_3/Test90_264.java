package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_264 {
    private final Production90_264 production = new Production90_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}