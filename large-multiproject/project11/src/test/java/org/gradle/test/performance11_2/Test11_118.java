package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_118 {
    private final Production11_118 production = new Production11_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}