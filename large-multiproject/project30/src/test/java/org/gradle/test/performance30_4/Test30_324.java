package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_324 {
    private final Production30_324 production = new Production30_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}