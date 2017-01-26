package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_65 {
    private final Production17_65 production = new Production17_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}