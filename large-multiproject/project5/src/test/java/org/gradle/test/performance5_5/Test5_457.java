package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_457 {
    private final Production5_457 production = new Production5_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}