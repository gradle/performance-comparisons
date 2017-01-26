package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_239 {
    private final Production15_239 production = new Production15_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}