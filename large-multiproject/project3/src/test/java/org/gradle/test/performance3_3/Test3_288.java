package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_288 {
    private final Production3_288 production = new Production3_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}