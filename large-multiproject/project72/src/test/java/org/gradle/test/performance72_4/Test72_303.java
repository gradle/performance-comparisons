package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_303 {
    private final Production72_303 production = new Production72_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}