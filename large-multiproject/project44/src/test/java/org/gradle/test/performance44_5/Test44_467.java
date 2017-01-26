package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_467 {
    private final Production44_467 production = new Production44_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}