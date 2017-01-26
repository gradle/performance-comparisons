package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_331 {
    private final Production92_331 production = new Production92_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}