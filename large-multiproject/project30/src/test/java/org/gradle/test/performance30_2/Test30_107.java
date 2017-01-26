package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_107 {
    private final Production30_107 production = new Production30_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}