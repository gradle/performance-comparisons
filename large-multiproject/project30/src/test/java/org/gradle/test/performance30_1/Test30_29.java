package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_29 {
    private final Production30_29 production = new Production30_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}