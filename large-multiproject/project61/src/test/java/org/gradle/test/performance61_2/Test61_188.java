package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_188 {
    private final Production61_188 production = new Production61_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}