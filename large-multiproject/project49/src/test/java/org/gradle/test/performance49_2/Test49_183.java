package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_183 {
    private final Production49_183 production = new Production49_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}