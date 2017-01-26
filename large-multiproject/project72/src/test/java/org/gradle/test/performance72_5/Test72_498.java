package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_498 {
    private final Production72_498 production = new Production72_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}