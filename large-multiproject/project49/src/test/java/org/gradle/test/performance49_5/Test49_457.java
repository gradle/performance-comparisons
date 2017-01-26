package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_457 {
    private final Production49_457 production = new Production49_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}