package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_227 {
    private final Production50_227 production = new Production50_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}