package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_40 {
    private final Production30_40 production = new Production30_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}