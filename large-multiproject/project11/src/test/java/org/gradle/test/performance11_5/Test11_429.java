package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_429 {
    private final Production11_429 production = new Production11_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}