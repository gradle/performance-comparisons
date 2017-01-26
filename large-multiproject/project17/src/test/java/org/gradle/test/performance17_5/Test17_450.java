package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_450 {
    private final Production17_450 production = new Production17_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}