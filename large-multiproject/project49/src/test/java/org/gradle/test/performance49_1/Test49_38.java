package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_38 {
    private final Production49_38 production = new Production49_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}