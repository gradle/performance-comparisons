package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_239 {
    private final Production85_239 production = new Production85_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}