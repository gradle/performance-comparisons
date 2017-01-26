package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_289 {
    private final Production30_289 production = new Production30_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}