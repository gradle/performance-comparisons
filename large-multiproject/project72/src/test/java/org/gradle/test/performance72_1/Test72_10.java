package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_10 {
    private final Production72_10 production = new Production72_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}