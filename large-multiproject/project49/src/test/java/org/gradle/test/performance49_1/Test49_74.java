package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_74 {
    private final Production49_74 production = new Production49_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}