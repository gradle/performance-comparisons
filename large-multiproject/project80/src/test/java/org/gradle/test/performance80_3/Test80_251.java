package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_251 {
    private final Production80_251 production = new Production80_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}