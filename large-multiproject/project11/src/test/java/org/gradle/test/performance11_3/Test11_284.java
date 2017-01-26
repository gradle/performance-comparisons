package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_284 {
    private final Production11_284 production = new Production11_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}