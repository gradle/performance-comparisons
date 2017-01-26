package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_94 {
    private final Production44_94 production = new Production44_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}