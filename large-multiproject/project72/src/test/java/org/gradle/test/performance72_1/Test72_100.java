package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_100 {
    private final Production72_100 production = new Production72_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}