package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_444 {
    private final Production3_444 production = new Production3_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}