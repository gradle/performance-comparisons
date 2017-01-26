package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_157 {
    private final Production89_157 production = new Production89_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}