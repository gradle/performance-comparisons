package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_239 {
    private final Production27_239 production = new Production27_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}