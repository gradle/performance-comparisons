package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_71 {
    private final Production7_71 production = new Production7_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}