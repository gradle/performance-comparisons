package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_195 {
    private final Production49_195 production = new Production49_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}