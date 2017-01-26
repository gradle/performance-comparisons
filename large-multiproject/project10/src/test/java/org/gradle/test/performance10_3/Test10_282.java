package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_282 {
    private final Production10_282 production = new Production10_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}