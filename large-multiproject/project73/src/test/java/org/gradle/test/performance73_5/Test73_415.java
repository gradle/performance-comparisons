package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_415 {
    private final Production73_415 production = new Production73_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}