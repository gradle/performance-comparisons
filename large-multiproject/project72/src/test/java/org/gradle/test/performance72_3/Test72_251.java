package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_251 {
    private final Production72_251 production = new Production72_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}