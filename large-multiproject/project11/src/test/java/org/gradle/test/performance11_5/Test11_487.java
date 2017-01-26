package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_487 {
    private final Production11_487 production = new Production11_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}