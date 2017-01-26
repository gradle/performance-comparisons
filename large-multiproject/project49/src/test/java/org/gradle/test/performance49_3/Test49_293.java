package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_293 {
    private final Production49_293 production = new Production49_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}