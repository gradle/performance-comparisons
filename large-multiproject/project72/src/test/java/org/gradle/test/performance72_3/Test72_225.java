package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_225 {
    private final Production72_225 production = new Production72_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}