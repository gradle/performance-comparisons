package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_140 {
    private final Production17_140 production = new Production17_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}