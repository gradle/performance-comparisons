package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_152 {
    private final Production17_152 production = new Production17_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}