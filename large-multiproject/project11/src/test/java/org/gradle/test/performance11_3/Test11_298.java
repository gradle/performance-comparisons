package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_298 {
    private final Production11_298 production = new Production11_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}