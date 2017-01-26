package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_282 {
    private final Production20_282 production = new Production20_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}