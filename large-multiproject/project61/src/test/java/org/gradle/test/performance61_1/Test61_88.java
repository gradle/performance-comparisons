package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_88 {
    private final Production61_88 production = new Production61_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}