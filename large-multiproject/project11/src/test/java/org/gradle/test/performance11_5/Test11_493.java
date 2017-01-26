package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_493 {
    private final Production11_493 production = new Production11_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}