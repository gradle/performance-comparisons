package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_133 {
    private final Production44_133 production = new Production44_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}