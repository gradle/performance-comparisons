package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_2 {
    private final Production58_2 production = new Production58_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}