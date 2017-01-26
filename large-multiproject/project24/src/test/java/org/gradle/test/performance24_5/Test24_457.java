package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_457 {
    private final Production24_457 production = new Production24_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}