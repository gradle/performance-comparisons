package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_282 {
    private final Production18_282 production = new Production18_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}