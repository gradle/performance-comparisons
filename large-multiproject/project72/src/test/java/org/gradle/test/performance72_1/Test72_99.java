package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_99 {
    private final Production72_99 production = new Production72_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}