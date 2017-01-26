package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_457 {
    private final Production7_457 production = new Production7_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}