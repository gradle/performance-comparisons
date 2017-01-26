package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_201 {
    private final Production44_201 production = new Production44_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}