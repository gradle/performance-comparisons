package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_71 {
    private final Production3_71 production = new Production3_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}