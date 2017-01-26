package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_202 {
    private final Production30_202 production = new Production30_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}