package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_457 {
    private final Production17_457 production = new Production17_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}