package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_36 {
    private final Production58_36 production = new Production58_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}