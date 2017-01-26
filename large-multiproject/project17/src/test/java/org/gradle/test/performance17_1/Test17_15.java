package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_15 {
    private final Production17_15 production = new Production17_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}