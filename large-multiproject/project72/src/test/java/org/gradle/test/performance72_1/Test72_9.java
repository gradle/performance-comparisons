package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_9 {
    private final Production72_9 production = new Production72_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}