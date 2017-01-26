package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_35 {
    private final Production58_35 production = new Production58_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}