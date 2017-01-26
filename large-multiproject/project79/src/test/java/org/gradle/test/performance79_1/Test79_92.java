package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_92 {
    private final Production79_92 production = new Production79_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}