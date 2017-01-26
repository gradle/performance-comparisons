package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_56 {
    private final Production11_56 production = new Production11_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}