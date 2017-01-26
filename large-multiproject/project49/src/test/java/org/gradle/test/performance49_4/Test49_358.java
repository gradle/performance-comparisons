package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_358 {
    private final Production49_358 production = new Production49_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}