package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_239 {
    private final Production60_239 production = new Production60_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}