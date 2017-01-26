package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_295 {
    private final Production73_295 production = new Production73_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}