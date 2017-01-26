package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_67 {
    private final Production7_67 production = new Production7_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}