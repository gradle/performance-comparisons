package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_26 {
    private final Production7_26 production = new Production7_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}