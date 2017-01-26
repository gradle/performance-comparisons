package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_322 {
    private final Production72_322 production = new Production72_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}