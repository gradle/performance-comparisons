package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_55 {
    private final Production17_55 production = new Production17_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}