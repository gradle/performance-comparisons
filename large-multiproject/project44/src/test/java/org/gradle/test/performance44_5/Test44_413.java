package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_413 {
    private final Production44_413 production = new Production44_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}