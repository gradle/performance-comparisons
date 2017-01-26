package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_114 {
    private final Production30_114 production = new Production30_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}