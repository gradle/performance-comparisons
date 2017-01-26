package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_457 {
    private final Production30_457 production = new Production30_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}