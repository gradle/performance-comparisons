package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_227 {
    private final Production74_227 production = new Production74_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}