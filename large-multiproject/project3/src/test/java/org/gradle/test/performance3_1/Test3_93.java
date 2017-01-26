package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_93 {
    private final Production3_93 production = new Production3_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}