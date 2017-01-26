package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_282 {
    private final Production3_282 production = new Production3_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}