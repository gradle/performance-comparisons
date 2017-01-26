package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_227 {
    private final Production89_227 production = new Production89_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}