package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_259 {
    private final Production49_259 production = new Production49_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}