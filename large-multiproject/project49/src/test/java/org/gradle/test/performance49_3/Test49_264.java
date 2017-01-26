package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_264 {
    private final Production49_264 production = new Production49_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}