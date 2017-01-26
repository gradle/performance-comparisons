package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_283 {
    private final Production30_283 production = new Production30_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}