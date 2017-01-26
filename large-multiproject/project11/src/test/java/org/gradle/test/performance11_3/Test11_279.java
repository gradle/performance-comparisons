package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_279 {
    private final Production11_279 production = new Production11_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}