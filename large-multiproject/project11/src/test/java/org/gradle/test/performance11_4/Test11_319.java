package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_319 {
    private final Production11_319 production = new Production11_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}