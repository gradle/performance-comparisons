package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_126 {
    private final Production61_126 production = new Production61_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}