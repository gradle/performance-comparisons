package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_341 {
    private final Production11_341 production = new Production11_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}