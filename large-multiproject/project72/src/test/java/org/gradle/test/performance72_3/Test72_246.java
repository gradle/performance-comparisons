package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_246 {
    private final Production72_246 production = new Production72_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}