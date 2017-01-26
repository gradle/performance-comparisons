package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_70 {
    private final Production44_70 production = new Production44_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}