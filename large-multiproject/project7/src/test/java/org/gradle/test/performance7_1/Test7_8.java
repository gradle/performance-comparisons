package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_8 {
    private final Production7_8 production = new Production7_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}