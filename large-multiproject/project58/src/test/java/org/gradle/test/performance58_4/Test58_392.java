package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_392 {
    private final Production58_392 production = new Production58_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}