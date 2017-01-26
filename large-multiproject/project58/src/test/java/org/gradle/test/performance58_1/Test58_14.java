package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_14 {
    private final Production58_14 production = new Production58_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}