package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_67 {
    private final Production72_67 production = new Production72_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}