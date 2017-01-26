package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_268 {
    private final Production72_268 production = new Production72_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}