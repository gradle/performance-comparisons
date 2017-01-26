package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_166 {
    private final Production49_166 production = new Production49_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}