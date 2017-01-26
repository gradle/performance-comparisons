package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_362 {
    private final Production89_362 production = new Production89_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}