package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_103 {
    private final Production11_103 production = new Production11_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}