package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_22 {
    private final Production11_22 production = new Production11_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}