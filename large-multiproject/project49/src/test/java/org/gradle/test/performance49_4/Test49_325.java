package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_325 {
    private final Production49_325 production = new Production49_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}