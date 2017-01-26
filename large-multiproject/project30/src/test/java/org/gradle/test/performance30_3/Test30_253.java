package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_253 {
    private final Production30_253 production = new Production30_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}