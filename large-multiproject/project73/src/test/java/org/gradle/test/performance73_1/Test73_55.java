package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_55 {
    private final Production73_55 production = new Production73_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}