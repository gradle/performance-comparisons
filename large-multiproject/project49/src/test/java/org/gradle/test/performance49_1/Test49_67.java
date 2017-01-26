package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_67 {
    private final Production49_67 production = new Production49_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}