package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_122 {
    private final Production44_122 production = new Production44_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}