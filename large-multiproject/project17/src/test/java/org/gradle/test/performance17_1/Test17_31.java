package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_31 {
    private final Production17_31 production = new Production17_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}