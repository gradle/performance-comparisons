package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_337 {
    private final Production3_337 production = new Production3_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}