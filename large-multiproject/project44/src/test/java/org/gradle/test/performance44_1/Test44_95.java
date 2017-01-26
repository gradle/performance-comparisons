package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_95 {
    private final Production44_95 production = new Production44_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}