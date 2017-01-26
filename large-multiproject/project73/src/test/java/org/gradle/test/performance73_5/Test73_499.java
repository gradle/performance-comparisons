package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_499 {
    private final Production73_499 production = new Production73_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}