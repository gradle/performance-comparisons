package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_428 {
    private final Production11_428 production = new Production11_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}