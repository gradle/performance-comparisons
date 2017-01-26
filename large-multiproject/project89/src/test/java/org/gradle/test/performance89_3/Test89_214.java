package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_214 {
    private final Production89_214 production = new Production89_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}