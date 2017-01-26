package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_13 {
    private final Production11_13 production = new Production11_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}