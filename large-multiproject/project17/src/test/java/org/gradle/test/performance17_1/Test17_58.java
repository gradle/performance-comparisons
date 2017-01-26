package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_58 {
    private final Production17_58 production = new Production17_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}