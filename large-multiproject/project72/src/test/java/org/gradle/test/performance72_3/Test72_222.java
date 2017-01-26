package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_222 {
    private final Production72_222 production = new Production72_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}