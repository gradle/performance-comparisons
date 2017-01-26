package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_69 {
    private final Production17_69 production = new Production17_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}