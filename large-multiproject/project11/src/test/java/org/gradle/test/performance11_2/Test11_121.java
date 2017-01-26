package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_121 {
    private final Production11_121 production = new Production11_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}