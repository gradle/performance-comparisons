package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_409 {
    private final Production73_409 production = new Production73_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}