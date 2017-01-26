package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_134 {
    private final Production58_134 production = new Production58_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}