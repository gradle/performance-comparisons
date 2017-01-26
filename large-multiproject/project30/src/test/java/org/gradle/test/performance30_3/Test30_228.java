package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_228 {
    private final Production30_228 production = new Production30_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}