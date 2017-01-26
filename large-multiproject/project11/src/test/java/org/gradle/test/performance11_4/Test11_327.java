package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_327 {
    private final Production11_327 production = new Production11_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}