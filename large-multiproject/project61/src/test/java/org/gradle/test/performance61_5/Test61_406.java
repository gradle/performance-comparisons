package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_406 {
    private final Production61_406 production = new Production61_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}