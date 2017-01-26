package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_227 {
    private final Production86_227 production = new Production86_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}