package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_355 {
    private final Production11_355 production = new Production11_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}