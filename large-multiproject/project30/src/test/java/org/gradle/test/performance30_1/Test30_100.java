package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_100 {
    private final Production30_100 production = new Production30_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}