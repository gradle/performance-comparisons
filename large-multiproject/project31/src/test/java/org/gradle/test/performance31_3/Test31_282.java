package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_282 {
    private final Production31_282 production = new Production31_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}