package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_331 {
    private final Production7_331 production = new Production7_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}