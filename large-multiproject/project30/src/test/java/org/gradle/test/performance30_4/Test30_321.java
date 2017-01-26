package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_321 {
    private final Production30_321 production = new Production30_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}