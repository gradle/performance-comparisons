package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_124 {
    private final Production11_124 production = new Production11_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}