package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_239 {
    private final Production10_239 production = new Production10_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}