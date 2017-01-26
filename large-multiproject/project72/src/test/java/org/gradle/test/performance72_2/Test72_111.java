package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_111 {
    private final Production72_111 production = new Production72_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}