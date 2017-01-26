package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_141 {
    private final Production11_141 production = new Production11_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}