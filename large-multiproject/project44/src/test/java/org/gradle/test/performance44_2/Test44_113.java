package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_113 {
    private final Production44_113 production = new Production44_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}