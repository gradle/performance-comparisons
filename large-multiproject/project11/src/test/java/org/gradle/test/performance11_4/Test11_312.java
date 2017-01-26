package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_312 {
    private final Production11_312 production = new Production11_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}