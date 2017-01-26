package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_251 {
    private final Production49_251 production = new Production49_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}