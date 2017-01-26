package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_71 {
    private final Production16_71 production = new Production16_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}