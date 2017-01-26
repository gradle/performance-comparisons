package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_227 {
    private final Production37_227 production = new Production37_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}