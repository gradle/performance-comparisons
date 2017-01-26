package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_125 {
    private final Production11_125 production = new Production11_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}