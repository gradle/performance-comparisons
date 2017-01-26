package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_227 {
    private final Production24_227 production = new Production24_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}