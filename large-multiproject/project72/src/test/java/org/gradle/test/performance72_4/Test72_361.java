package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_361 {
    private final Production72_361 production = new Production72_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}