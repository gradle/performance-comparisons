package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_107 {
    private final Production5_107 production = new Production5_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}