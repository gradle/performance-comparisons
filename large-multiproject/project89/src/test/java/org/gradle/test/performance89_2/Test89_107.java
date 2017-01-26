package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_107 {
    private final Production89_107 production = new Production89_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}