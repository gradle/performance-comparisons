package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_413 {
    private final Production11_413 production = new Production11_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}