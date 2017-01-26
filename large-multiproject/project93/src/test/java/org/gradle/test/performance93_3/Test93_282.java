package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_282 {
    private final Production93_282 production = new Production93_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}