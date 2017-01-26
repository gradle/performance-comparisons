package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_80 {
    private final Production30_80 production = new Production30_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}