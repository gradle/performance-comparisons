package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_239 {
    private final Production92_239 production = new Production92_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}