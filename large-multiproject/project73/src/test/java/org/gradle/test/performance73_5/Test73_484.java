package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_484 {
    private final Production73_484 production = new Production73_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}