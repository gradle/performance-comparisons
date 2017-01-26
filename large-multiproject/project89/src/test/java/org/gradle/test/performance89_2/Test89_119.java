package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_119 {
    private final Production89_119 production = new Production89_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}