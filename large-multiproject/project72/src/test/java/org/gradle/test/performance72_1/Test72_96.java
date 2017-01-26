package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_96 {
    private final Production72_96 production = new Production72_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}