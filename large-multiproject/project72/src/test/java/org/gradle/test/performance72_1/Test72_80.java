package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_80 {
    private final Production72_80 production = new Production72_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}