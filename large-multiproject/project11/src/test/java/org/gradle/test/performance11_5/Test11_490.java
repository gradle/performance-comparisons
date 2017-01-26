package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_490 {
    private final Production11_490 production = new Production11_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}