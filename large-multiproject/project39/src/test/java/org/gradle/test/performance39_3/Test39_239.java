package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_239 {
    private final Production39_239 production = new Production39_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}