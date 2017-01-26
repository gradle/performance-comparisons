package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_224 {
    private final Production11_224 production = new Production11_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}