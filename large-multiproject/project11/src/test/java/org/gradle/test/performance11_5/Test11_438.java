package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_438 {
    private final Production11_438 production = new Production11_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}