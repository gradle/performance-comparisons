package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_116 {
    private final Production11_116 production = new Production11_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}