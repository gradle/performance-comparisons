package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_323 {
    private final Production89_323 production = new Production89_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}