package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_2 {
    private final Production17_2 production = new Production17_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}