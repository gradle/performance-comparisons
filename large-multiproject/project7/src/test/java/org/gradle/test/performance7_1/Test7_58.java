package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_58 {
    private final Production7_58 production = new Production7_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}