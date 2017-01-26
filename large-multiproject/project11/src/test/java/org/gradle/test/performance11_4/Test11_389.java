package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_389 {
    private final Production11_389 production = new Production11_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}