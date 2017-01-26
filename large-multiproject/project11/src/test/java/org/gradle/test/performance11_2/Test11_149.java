package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_149 {
    private final Production11_149 production = new Production11_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}