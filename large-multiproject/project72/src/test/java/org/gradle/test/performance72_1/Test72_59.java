package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_59 {
    private final Production72_59 production = new Production72_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}