package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_228 {
    private final Production61_228 production = new Production61_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}