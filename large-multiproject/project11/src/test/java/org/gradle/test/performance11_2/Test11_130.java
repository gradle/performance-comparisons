package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_130 {
    private final Production11_130 production = new Production11_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}