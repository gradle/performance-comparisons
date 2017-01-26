package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_107 {
    private final Production3_107 production = new Production3_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}