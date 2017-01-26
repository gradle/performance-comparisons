package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_457 {
    private final Production3_457 production = new Production3_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}