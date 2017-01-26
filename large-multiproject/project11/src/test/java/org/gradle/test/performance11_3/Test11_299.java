package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_299 {
    private final Production11_299 production = new Production11_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}