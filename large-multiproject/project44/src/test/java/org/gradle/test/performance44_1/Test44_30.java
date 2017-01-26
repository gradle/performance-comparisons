package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_30 {
    private final Production44_30 production = new Production44_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}