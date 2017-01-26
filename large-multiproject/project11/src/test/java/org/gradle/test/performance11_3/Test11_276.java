package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_276 {
    private final Production11_276 production = new Production11_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}