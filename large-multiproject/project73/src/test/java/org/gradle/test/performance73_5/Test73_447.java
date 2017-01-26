package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_447 {
    private final Production73_447 production = new Production73_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}