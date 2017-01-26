package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_240 {
    private final Production11_240 production = new Production11_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}