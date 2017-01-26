package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_448 {
    private final Production11_448 production = new Production11_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}