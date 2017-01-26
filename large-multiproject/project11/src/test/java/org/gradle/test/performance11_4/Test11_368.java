package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_368 {
    private final Production11_368 production = new Production11_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}