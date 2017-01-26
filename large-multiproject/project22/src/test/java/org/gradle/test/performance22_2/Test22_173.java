package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_173 {
    private final Production22_173 production = new Production22_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}