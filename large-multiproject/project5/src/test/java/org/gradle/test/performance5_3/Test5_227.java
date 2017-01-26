package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_227 {
    private final Production5_227 production = new Production5_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}