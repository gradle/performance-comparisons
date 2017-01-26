package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_347 {
    private final Production3_347 production = new Production3_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}