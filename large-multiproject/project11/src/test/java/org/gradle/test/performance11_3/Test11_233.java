package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_233 {
    private final Production11_233 production = new Production11_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}