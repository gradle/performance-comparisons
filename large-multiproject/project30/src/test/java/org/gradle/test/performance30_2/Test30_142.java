package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_142 {
    private final Production30_142 production = new Production30_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}