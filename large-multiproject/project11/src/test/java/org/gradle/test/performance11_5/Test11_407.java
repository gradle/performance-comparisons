package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_407 {
    private final Production11_407 production = new Production11_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}