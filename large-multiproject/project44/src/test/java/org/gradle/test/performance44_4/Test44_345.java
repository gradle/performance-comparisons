package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_345 {
    private final Production44_345 production = new Production44_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}