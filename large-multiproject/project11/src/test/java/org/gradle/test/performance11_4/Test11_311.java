package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_311 {
    private final Production11_311 production = new Production11_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}