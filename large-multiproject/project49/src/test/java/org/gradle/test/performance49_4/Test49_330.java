package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_330 {
    private final Production49_330 production = new Production49_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}