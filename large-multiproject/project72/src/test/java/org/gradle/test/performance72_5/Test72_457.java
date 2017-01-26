package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_457 {
    private final Production72_457 production = new Production72_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}