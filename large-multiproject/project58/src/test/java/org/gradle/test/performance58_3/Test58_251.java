package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_251 {
    private final Production58_251 production = new Production58_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}