package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_134 {
    private final Production17_134 production = new Production17_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}