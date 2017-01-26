package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_29 {
    private final Production61_29 production = new Production61_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}