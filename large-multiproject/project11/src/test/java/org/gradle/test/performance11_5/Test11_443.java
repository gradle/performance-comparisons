package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_443 {
    private final Production11_443 production = new Production11_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}