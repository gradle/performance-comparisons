package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_173 {
    private final Production73_173 production = new Production73_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}