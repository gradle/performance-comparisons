package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_44 {
    private final Production89_44 production = new Production89_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}