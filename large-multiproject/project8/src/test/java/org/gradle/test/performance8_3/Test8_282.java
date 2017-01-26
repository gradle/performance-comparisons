package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_282 {
    private final Production8_282 production = new Production8_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}