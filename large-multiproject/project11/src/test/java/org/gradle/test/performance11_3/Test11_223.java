package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_223 {
    private final Production11_223 production = new Production11_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}