package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_38 {
    private final Production30_38 production = new Production30_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}