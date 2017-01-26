package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_233 {
    private final Production79_233 production = new Production79_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}