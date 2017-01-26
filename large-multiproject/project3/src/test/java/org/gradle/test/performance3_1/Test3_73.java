package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_73 {
    private final Production3_73 production = new Production3_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}