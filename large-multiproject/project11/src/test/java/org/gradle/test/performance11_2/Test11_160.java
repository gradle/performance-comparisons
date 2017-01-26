package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_160 {
    private final Production11_160 production = new Production11_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}