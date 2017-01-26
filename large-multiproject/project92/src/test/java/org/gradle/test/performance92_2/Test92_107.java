package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_107 {
    private final Production92_107 production = new Production92_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}