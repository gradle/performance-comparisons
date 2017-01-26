package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_344 {
    private final Production11_344 production = new Production11_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}