package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_142 {
    private final Production7_142 production = new Production7_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}