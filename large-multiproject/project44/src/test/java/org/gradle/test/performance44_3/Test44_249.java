package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_249 {
    private final Production44_249 production = new Production44_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}