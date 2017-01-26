package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_470 {
    private final Production73_470 production = new Production73_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}