package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_227 {
    private final Production49_227 production = new Production49_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}