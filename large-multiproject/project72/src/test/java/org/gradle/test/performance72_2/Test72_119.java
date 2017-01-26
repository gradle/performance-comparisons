package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_119 {
    private final Production72_119 production = new Production72_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}