package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_340 {
    private final Production73_340 production = new Production73_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}