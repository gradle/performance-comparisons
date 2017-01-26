package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_491 {
    private final Production11_491 production = new Production11_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}