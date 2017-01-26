package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_114 {
    private final Production17_114 production = new Production17_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}