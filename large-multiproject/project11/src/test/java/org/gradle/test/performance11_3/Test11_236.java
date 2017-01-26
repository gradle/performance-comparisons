package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_236 {
    private final Production11_236 production = new Production11_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}