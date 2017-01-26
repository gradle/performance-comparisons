package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_346 {
    private final Production11_346 production = new Production11_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}