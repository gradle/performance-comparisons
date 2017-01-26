package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_228 {
    private final Production72_228 production = new Production72_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}