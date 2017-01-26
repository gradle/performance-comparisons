package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_362 {
    private final Production3_362 production = new Production3_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}