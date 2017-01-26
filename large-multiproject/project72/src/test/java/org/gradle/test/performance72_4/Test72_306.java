package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_306 {
    private final Production72_306 production = new Production72_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}