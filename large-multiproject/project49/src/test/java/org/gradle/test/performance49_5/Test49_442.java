package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_442 {
    private final Production49_442 production = new Production49_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}