package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_168 {
    private final Production49_168 production = new Production49_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}