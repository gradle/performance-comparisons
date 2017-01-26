package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_282 {
    private final Production58_282 production = new Production58_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}