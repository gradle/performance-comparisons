package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_233 {
    private final Production85_233 production = new Production85_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}