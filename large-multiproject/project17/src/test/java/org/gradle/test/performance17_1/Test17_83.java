package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_83 {
    private final Production17_83 production = new Production17_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}