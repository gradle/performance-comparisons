package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_382 {
    private final Production72_382 production = new Production72_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}