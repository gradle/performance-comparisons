package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_214 {
    private final Production49_214 production = new Production49_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}