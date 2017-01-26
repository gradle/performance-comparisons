package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_51 {
    private final Production17_51 production = new Production17_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}