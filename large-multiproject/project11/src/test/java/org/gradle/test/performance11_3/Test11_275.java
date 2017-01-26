package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_275 {
    private final Production11_275 production = new Production11_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}