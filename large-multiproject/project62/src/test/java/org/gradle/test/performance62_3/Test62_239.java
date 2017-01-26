package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_239 {
    private final Production62_239 production = new Production62_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}