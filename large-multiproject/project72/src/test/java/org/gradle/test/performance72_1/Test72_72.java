package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_72 {
    private final Production72_72 production = new Production72_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}