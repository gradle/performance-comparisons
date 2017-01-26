package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_227 {
    private final Production77_227 production = new Production77_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}