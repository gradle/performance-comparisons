package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_35 {
    private final Production17_35 production = new Production17_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}