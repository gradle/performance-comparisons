package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_331 {
    private final Production20_331 production = new Production20_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}