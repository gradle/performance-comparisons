package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_281 {
    private final Production72_281 production = new Production72_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}