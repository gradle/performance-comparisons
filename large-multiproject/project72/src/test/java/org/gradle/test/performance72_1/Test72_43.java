package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_43 {
    private final Production72_43 production = new Production72_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}