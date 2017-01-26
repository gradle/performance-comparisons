package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_374 {
    private final Production11_374 production = new Production11_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}