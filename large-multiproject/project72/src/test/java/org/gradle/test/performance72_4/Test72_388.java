package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_388 {
    private final Production72_388 production = new Production72_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}