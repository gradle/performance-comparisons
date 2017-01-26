package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_132 {
    private final Production11_132 production = new Production11_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}