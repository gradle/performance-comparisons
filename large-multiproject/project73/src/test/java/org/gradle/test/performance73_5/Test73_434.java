package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_434 {
    private final Production73_434 production = new Production73_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}