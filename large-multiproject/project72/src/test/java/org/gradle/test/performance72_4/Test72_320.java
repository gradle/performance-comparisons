package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_320 {
    private final Production72_320 production = new Production72_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}