package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_372 {
    private final Production11_372 production = new Production11_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}