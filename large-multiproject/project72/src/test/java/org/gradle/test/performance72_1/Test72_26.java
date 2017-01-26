package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_26 {
    private final Production72_26 production = new Production72_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}