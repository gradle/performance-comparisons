package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_230 {
    private final Production72_230 production = new Production72_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}