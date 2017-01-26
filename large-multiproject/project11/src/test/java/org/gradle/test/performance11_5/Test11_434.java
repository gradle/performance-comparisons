package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_434 {
    private final Production11_434 production = new Production11_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}