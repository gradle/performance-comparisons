package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_266 {
    private final Production30_266 production = new Production30_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}