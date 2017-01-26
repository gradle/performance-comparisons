package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_120 {
    private final Production11_120 production = new Production11_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}