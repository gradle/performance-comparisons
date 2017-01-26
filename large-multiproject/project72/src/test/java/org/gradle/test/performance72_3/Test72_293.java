package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_293 {
    private final Production72_293 production = new Production72_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}