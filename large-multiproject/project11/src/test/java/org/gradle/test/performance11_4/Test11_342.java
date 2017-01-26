package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_342 {
    private final Production11_342 production = new Production11_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}