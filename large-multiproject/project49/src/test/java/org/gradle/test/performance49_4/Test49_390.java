package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_390 {
    private final Production49_390 production = new Production49_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}