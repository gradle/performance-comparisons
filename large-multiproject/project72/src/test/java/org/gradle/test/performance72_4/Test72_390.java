package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_390 {
    private final Production72_390 production = new Production72_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}