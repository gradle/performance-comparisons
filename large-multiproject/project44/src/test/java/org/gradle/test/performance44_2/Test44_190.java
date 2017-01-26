package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_190 {
    private final Production44_190 production = new Production44_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}