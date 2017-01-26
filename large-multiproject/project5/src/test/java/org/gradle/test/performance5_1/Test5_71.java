package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_71 {
    private final Production5_71 production = new Production5_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}