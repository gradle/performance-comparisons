package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_270 {
    private final Production49_270 production = new Production49_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}