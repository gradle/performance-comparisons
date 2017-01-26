package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_253 {
    private final Production72_253 production = new Production72_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}