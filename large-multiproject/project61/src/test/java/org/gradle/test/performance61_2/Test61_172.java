package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_172 {
    private final Production61_172 production = new Production61_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}