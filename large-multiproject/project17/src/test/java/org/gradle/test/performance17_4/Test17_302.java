package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_302 {
    private final Production17_302 production = new Production17_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}