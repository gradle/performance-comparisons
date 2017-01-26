package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_347 {
    private final Production72_347 production = new Production72_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}