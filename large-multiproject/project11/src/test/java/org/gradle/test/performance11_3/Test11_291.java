package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_291 {
    private final Production11_291 production = new Production11_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}