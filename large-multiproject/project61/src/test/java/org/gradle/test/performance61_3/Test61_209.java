package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_209 {
    private final Production61_209 production = new Production61_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}