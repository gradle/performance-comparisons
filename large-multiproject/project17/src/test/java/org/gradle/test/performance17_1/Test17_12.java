package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_12 {
    private final Production17_12 production = new Production17_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}