package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_326 {
    private final Production61_326 production = new Production61_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}