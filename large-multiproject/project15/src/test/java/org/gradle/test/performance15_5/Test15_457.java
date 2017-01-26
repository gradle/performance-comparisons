package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_457 {
    private final Production15_457 production = new Production15_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}