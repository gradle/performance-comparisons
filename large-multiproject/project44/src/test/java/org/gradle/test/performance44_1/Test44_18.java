package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_18 {
    private final Production44_18 production = new Production44_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}