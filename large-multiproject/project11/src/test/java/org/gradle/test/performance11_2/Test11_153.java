package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_153 {
    private final Production11_153 production = new Production11_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}