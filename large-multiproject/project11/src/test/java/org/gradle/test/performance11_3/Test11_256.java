package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_256 {
    private final Production11_256 production = new Production11_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}