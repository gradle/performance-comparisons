package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_227 {
    private final Production15_227 production = new Production15_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}