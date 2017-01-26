package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_498 {
    private final Production3_498 production = new Production3_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}