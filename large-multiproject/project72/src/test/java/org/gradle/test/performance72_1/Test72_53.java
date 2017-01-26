package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_53 {
    private final Production72_53 production = new Production72_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}