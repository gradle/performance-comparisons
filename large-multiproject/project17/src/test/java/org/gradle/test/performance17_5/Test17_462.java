package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_462 {
    private final Production17_462 production = new Production17_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}