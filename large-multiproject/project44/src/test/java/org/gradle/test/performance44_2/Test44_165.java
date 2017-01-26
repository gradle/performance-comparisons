package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_165 {
    private final Production44_165 production = new Production44_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}