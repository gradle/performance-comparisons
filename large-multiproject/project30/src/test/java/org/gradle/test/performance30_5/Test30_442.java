package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_442 {
    private final Production30_442 production = new Production30_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}