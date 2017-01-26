package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_8 {
    private final Production49_8 production = new Production49_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}