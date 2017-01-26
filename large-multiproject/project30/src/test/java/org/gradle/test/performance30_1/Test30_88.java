package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_88 {
    private final Production30_88 production = new Production30_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}