package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_68 {
    private final Production3_68 production = new Production3_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}