package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_238 {
    private final Production89_238 production = new Production89_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}