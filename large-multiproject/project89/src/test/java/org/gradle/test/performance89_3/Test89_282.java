package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_282 {
    private final Production89_282 production = new Production89_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}