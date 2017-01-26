package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_249 {
    private final Production30_249 production = new Production30_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}