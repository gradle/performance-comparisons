package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_41 {
    private final Production30_41 production = new Production30_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}