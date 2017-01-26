package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_401 {
    private final Production73_401 production = new Production73_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}