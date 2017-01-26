package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_157 {
    private final Production49_157 production = new Production49_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}