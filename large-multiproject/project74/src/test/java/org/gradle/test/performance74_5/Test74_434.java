package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_434 {
    private final Production74_434 production = new Production74_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}