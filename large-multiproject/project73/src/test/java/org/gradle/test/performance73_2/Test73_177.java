package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_177 {
    private final Production73_177 production = new Production73_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}