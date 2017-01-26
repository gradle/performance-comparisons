package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_227 {
    private final Production39_227 production = new Production39_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}