package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_97 {
    private final Production61_97 production = new Production61_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}