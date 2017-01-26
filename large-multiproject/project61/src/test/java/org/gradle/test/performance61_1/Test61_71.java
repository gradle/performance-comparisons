package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_71 {
    private final Production61_71 production = new Production61_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}