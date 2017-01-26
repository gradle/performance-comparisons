package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_170 {
    private final Production44_170 production = new Production44_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}