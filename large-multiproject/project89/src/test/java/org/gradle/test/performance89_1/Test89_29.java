package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_29 {
    private final Production89_29 production = new Production89_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}