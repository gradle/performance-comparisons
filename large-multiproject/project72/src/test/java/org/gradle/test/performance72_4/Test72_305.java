package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_305 {
    private final Production72_305 production = new Production72_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}