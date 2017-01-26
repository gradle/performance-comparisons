package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_227 {
    private final Production20_227 production = new Production20_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}