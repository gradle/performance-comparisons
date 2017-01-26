package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_391 {
    private final Production11_391 production = new Production11_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}