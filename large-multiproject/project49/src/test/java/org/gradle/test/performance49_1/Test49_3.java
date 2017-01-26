package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_3 {
    private final Production49_3 production = new Production49_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}