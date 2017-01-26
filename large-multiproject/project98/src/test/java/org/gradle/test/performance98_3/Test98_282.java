package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_282 {
    private final Production98_282 production = new Production98_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}