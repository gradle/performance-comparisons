package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_68 {
    private final Production49_68 production = new Production49_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}