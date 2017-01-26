package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_364 {
    private final Production58_364 production = new Production58_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}