package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_172 {
    private final Production49_172 production = new Production49_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}