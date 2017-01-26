package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_91 {
    private final Production61_91 production = new Production61_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}