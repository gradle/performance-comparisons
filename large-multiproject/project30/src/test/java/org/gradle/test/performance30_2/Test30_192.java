package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_192 {
    private final Production30_192 production = new Production30_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}