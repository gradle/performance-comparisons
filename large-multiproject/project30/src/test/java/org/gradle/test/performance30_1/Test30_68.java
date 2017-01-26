package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_68 {
    private final Production30_68 production = new Production30_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}