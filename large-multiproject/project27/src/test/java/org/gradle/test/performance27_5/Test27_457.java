package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_457 {
    private final Production27_457 production = new Production27_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}