package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_107 {
    private final Production17_107 production = new Production17_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}