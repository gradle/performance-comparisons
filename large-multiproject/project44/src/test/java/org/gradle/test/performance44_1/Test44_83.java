package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_83 {
    private final Production44_83 production = new Production44_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}