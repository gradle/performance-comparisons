package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_334 {
    private final Production11_334 production = new Production11_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}