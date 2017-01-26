package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_239 {
    private final Production58_239 production = new Production58_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}