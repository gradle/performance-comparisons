package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_107 {
    private final Production49_107 production = new Production49_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}