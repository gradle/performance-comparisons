package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_373 {
    private final Production49_373 production = new Production49_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}