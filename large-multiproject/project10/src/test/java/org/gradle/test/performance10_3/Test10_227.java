package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_227 {
    private final Production10_227 production = new Production10_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}