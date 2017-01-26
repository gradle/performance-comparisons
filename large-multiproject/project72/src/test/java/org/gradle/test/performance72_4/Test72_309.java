package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_309 {
    private final Production72_309 production = new Production72_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}