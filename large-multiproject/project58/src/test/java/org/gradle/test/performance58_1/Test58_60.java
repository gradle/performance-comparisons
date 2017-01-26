package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_60 {
    private final Production58_60 production = new Production58_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}