package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_33 {
    private final Production58_33 production = new Production58_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}