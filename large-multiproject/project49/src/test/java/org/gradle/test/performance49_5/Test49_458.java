package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_458 {
    private final Production49_458 production = new Production49_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}