package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_251 {
    private final Production30_251 production = new Production30_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}