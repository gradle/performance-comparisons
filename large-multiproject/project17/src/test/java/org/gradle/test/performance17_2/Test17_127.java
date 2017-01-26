package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_127 {
    private final Production17_127 production = new Production17_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}