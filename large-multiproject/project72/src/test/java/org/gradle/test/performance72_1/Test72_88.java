package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_88 {
    private final Production72_88 production = new Production72_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}