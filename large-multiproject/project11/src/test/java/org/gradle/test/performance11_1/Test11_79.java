package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_79 {
    private final Production11_79 production = new Production11_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}