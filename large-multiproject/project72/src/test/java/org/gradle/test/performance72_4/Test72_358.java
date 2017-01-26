package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_358 {
    private final Production72_358 production = new Production72_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}