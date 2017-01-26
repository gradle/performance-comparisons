package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_104 {
    private final Production79_104 production = new Production79_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}