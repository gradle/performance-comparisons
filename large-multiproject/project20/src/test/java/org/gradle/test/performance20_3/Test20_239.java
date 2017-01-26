package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_239 {
    private final Production20_239 production = new Production20_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}