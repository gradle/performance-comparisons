package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_358 {
    private final Production30_358 production = new Production30_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}