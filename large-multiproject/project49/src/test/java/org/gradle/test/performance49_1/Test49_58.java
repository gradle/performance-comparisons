package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_58 {
    private final Production49_58 production = new Production49_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}