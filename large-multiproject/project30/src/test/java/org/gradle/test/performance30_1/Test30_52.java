package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_52 {
    private final Production30_52 production = new Production30_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}