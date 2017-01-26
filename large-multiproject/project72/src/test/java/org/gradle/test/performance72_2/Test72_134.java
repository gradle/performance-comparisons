package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_134 {
    private final Production72_134 production = new Production72_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}