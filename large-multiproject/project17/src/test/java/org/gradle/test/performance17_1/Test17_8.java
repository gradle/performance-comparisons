package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_8 {
    private final Production17_8 production = new Production17_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}