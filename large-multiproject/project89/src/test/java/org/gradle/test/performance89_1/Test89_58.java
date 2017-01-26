package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_58 {
    private final Production89_58 production = new Production89_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}