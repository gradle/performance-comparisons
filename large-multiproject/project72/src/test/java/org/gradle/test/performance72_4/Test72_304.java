package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_304 {
    private final Production72_304 production = new Production72_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}