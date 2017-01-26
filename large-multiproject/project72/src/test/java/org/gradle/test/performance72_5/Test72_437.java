package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_437 {
    private final Production72_437 production = new Production72_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}