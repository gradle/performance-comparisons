package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_109 {
    private final Production58_109 production = new Production58_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}