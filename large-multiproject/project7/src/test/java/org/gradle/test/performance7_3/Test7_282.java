package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_282 {
    private final Production7_282 production = new Production7_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}