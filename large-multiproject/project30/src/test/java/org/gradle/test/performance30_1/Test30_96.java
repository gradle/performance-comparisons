package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_96 {
    private final Production30_96 production = new Production30_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}