package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_367 {
    private final Production17_367 production = new Production17_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}