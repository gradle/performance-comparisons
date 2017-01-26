package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_176 {
    private final Production44_176 production = new Production44_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}