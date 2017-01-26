package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_46 {
    private final Production17_46 production = new Production17_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}