package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_227 {
    private final Production3_227 production = new Production3_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}