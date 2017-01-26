package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_331 {
    private final Production5_331 production = new Production5_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}