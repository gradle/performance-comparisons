package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_367 {
    private final Production58_367 production = new Production58_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}