package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_89 {
    private final Production49_89 production = new Production49_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}