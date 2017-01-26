package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_392 {
    private final Production49_392 production = new Production49_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}