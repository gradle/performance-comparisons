package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_107 {
    private final Production4_107 production = new Production4_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}