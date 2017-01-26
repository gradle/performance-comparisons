package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_266 {
    private final Production89_266 production = new Production89_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}