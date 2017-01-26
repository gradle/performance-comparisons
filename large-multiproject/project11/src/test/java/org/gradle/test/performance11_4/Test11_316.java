package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_316 {
    private final Production11_316 production = new Production11_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}