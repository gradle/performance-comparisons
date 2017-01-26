package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_58 {
    private final Production72_58 production = new Production72_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}