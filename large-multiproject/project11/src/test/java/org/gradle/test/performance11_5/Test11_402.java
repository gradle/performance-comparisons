package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_402 {
    private final Production11_402 production = new Production11_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}