package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_14 {
    private final Production49_14 production = new Production49_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}