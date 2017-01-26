package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_241 {
    private final Production49_241 production = new Production49_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}