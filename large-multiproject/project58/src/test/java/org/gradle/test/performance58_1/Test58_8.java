package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_8 {
    private final Production58_8 production = new Production58_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}