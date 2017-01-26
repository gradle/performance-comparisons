package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_197 {
    private final Production11_197 production = new Production11_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}