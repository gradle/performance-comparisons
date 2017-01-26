package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_122 {
    private final Production73_122 production = new Production73_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}