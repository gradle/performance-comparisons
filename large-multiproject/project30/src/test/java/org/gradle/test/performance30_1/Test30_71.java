package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_71 {
    private final Production30_71 production = new Production30_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}