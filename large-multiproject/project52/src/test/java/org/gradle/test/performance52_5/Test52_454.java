package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_454 {
    private final Production52_454 production = new Production52_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}