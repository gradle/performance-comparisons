package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_202 {
    private final Production72_202 production = new Production72_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}