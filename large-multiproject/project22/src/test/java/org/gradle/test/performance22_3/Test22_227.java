package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_227 {
    private final Production22_227 production = new Production22_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}