package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_227 {
    private final Production85_227 production = new Production85_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}