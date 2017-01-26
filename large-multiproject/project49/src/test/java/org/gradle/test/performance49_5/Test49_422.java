package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_422 {
    private final Production49_422 production = new Production49_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}