package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_233 {
    private final Production33_233 production = new Production33_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}