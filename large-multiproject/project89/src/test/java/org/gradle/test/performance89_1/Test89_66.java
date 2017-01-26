package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_66 {
    private final Production89_66 production = new Production89_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}