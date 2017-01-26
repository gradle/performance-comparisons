package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_216 {
    private final Production72_216 production = new Production72_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}