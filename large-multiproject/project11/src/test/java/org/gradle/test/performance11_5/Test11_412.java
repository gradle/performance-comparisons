package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_412 {
    private final Production11_412 production = new Production11_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}