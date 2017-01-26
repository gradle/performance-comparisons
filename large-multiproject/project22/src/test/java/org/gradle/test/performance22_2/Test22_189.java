package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_189 {
    private final Production22_189 production = new Production22_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}