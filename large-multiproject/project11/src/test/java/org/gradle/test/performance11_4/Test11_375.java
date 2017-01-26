package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_375 {
    private final Production11_375 production = new Production11_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}