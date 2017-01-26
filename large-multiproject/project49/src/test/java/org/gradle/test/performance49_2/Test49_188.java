package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_188 {
    private final Production49_188 production = new Production49_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}