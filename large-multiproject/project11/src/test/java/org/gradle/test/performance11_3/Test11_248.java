package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_248 {
    private final Production11_248 production = new Production11_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}