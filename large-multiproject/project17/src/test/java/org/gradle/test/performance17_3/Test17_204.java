package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_204 {
    private final Production17_204 production = new Production17_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}