package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_463 {
    private final Production11_463 production = new Production11_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}