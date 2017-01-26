package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_96 {
    private final Production49_96 production = new Production49_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}