package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_264 {
    private final Production43_264 production = new Production43_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}