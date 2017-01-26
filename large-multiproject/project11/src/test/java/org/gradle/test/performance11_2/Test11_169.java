package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_169 {
    private final Production11_169 production = new Production11_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}