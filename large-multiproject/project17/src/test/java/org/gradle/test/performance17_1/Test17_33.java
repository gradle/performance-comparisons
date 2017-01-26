package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_33 {
    private final Production17_33 production = new Production17_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}