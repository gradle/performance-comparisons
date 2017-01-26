package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_221 {
    private final Production30_221 production = new Production30_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}