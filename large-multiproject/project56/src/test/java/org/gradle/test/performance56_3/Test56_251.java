package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_251 {
    private final Production56_251 production = new Production56_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}