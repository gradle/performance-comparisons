package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_24 {
    private final Production11_24 production = new Production11_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}