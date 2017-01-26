package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_385 {
    private final Production11_385 production = new Production11_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}