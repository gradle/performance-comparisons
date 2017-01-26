package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_465 {
    private final Production3_465 production = new Production3_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}