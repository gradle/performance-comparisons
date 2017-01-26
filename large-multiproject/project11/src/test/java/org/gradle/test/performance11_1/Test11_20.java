package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_20 {
    private final Production11_20 production = new Production11_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}