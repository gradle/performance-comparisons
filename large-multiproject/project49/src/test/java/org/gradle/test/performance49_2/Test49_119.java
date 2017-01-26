package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_119 {
    private final Production49_119 production = new Production49_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}