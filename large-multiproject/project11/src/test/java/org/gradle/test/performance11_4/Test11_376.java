package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_376 {
    private final Production11_376 production = new Production11_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}