package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_10 {
    private final Production17_10 production = new Production17_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}