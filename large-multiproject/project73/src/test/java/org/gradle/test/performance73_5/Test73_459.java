package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_459 {
    private final Production73_459 production = new Production73_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}