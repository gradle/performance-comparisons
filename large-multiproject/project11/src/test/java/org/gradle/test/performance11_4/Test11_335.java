package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_335 {
    private final Production11_335 production = new Production11_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}