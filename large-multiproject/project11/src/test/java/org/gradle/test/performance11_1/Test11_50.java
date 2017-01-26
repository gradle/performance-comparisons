package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_50 {
    private final Production11_50 production = new Production11_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}