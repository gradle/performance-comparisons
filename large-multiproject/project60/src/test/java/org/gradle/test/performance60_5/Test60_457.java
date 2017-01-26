package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_457 {
    private final Production60_457 production = new Production60_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}