package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_14 {
    private final Production72_14 production = new Production72_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}