package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_392 {
    private final Production72_392 production = new Production72_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}