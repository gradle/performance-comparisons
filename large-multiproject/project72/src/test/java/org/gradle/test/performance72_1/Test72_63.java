package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_63 {
    private final Production72_63 production = new Production72_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}