package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_176 {
    private final Production30_176 production = new Production30_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}