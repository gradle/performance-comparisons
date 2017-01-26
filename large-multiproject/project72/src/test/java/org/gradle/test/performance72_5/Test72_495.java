package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_495 {
    private final Production72_495 production = new Production72_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}