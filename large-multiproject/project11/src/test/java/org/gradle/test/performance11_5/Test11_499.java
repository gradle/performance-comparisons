package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_499 {
    private final Production11_499 production = new Production11_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}