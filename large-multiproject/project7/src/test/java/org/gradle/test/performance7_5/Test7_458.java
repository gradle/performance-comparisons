package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_458 {
    private final Production7_458 production = new Production7_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}