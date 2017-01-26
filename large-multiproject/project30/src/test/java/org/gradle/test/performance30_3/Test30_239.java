package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_239 {
    private final Production30_239 production = new Production30_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}