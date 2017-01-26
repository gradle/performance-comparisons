package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_280 {
    private final Production11_280 production = new Production11_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}