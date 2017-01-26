package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_356 {
    private final Production30_356 production = new Production30_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}