package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_40 {
    private final Production72_40 production = new Production72_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}