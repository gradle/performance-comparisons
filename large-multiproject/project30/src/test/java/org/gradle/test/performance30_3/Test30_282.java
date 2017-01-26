package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_282 {
    private final Production30_282 production = new Production30_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}