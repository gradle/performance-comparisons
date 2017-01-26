package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_239 {
    private final Production24_239 production = new Production24_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}