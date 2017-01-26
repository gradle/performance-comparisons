package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_258 {
    private final Production44_258 production = new Production44_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}