package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_302 {
    private final Production30_302 production = new Production30_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}