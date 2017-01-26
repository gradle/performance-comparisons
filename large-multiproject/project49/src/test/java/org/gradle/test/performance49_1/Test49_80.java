package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_80 {
    private final Production49_80 production = new Production49_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}