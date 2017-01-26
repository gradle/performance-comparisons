package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_227 {
    private final Production26_227 production = new Production26_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}