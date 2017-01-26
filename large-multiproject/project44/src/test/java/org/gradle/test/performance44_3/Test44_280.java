package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_280 {
    private final Production44_280 production = new Production44_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}