package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_227 {
    private final Production62_227 production = new Production62_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}