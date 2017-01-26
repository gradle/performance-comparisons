package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_62 {
    private final Production30_62 production = new Production30_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}