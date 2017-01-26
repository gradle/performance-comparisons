package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_201 {
    private final Production11_201 production = new Production11_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}