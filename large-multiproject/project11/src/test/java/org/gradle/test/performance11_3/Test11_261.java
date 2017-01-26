package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_261 {
    private final Production11_261 production = new Production11_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}