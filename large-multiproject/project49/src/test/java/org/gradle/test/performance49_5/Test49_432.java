package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_432 {
    private final Production49_432 production = new Production49_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}