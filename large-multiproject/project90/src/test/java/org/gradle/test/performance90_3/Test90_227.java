package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_227 {
    private final Production90_227 production = new Production90_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}