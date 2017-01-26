package org.gradle.test.performancenull_369;

import static org.junit.Assert.*;

public class Testnull_36842 {
    private final Productionnull_36842 production = new Productionnull_36842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}