package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_325 {
    private final Production72_325 production = new Production72_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}