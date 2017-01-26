package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_29 {
    private final Production72_29 production = new Production72_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}