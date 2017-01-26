package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_362 {
    private final Production72_362 production = new Production72_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}