package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_75 {
    private final Production49_75 production = new Production49_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}