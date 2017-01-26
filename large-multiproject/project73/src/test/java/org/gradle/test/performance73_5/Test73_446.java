package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_446 {
    private final Production73_446 production = new Production73_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}