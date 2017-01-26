package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_105 {
    private final Production44_105 production = new Production44_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}