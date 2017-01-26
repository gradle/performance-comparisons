package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_436 {
    private final Production73_436 production = new Production73_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}