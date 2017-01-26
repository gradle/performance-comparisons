package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_11 {
    private final Production11_11 production = new Production11_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}