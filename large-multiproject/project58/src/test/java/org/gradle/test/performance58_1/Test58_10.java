package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_10 {
    private final Production58_10 production = new Production58_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}