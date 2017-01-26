package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_341 {
    private final Production44_341 production = new Production44_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}