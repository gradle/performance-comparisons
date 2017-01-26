package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_98 {
    private final Production49_98 production = new Production49_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}