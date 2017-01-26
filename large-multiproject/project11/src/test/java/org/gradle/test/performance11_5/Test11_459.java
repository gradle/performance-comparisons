package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_459 {
    private final Production11_459 production = new Production11_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}