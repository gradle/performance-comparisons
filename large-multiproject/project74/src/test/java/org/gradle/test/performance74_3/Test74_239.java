package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_239 {
    private final Production74_239 production = new Production74_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}