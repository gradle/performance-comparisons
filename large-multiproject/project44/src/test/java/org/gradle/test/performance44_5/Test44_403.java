package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_403 {
    private final Production44_403 production = new Production44_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}