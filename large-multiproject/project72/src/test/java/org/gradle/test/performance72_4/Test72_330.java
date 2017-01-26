package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_330 {
    private final Production72_330 production = new Production72_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}