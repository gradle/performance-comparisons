package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_297 {
    private final Production72_297 production = new Production72_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}