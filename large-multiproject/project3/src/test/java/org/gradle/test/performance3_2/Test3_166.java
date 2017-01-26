package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_166 {
    private final Production3_166 production = new Production3_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}