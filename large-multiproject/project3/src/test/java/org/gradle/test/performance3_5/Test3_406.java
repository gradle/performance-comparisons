package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_406 {
    private final Production3_406 production = new Production3_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}