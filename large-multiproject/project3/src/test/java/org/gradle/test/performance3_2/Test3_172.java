package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_172 {
    private final Production3_172 production = new Production3_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}