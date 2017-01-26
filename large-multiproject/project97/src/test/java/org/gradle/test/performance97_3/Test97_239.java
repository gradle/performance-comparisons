package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_239 {
    private final Production97_239 production = new Production97_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}