package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_26 {
    private final Production17_26 production = new Production17_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}