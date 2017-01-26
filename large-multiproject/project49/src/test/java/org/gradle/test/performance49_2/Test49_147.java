package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_147 {
    private final Production49_147 production = new Production49_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}