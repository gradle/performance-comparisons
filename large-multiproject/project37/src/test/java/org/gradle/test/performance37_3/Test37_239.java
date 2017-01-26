package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_239 {
    private final Production37_239 production = new Production37_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}