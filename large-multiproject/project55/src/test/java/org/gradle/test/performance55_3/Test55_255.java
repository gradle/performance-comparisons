package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_255 {
    private final Production55_255 production = new Production55_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}