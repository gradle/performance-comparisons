package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_239 {
    private final Production7_239 production = new Production7_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}