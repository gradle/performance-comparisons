package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_251 {
    private final Production89_251 production = new Production89_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}