package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_110 {
    private final Production11_110 production = new Production11_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}