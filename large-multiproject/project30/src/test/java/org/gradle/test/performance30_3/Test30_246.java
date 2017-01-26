package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_246 {
    private final Production30_246 production = new Production30_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}