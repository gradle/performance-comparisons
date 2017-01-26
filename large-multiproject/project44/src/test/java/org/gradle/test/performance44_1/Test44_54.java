package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_54 {
    private final Production44_54 production = new Production44_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}