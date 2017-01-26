package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_230 {
    private final Production30_230 production = new Production30_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}