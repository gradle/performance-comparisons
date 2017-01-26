package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_472 {
    private final Production73_472 production = new Production73_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}