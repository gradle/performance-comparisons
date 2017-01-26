package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_295 {
    private final Production97_295 production = new Production97_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}