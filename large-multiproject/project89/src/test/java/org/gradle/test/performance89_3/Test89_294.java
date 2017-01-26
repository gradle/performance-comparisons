package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_294 {
    private final Production89_294 production = new Production89_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}