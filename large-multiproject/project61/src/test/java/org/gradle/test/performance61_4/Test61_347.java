package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_347 {
    private final Production61_347 production = new Production61_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}