package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_382 {
    private final Production30_382 production = new Production30_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}