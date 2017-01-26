package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_305 {
    private final Production30_305 production = new Production30_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}