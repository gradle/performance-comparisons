package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_27 {
    private final Production92_27 production = new Production92_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}