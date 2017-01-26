package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_106 {
    private final Production79_106 production = new Production79_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}