package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_66 {
    private final Production72_66 production = new Production72_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}