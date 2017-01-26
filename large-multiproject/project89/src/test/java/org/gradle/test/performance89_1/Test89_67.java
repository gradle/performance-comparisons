package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_67 {
    private final Production89_67 production = new Production89_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}