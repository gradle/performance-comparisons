package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_98 {
    private final Production72_98 production = new Production72_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}