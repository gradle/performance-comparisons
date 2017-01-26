package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_414 {
    private final Production11_414 production = new Production11_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}