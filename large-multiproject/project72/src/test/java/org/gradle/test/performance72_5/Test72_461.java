package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_461 {
    private final Production72_461 production = new Production72_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}