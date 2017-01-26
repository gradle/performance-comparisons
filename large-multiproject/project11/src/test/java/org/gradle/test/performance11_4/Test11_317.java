package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_317 {
    private final Production11_317 production = new Production11_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}