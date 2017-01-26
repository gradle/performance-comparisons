package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_91 {
    private final Production30_91 production = new Production30_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}