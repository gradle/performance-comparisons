package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_321 {
    private final Production73_321 production = new Production73_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}