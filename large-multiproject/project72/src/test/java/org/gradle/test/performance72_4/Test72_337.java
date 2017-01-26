package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_337 {
    private final Production72_337 production = new Production72_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}