package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_239 {
    private final Production77_239 production = new Production77_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}