package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_67 {
    private final Production30_67 production = new Production30_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}