package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_332 {
    private final Production11_332 production = new Production11_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}