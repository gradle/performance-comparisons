package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_254 {
    private final Production30_254 production = new Production30_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}