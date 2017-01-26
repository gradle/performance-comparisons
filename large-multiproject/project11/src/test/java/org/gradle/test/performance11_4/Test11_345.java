package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_345 {
    private final Production11_345 production = new Production11_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}