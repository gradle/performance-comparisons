package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_338 {
    private final Production49_338 production = new Production49_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}