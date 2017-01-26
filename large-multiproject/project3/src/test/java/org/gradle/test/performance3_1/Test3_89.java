package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_89 {
    private final Production3_89 production = new Production3_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}