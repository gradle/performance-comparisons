package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_432 {
    private final Production3_432 production = new Production3_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}