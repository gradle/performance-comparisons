package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_436 {
    private final Production11_436 production = new Production11_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}