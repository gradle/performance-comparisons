package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_134 {
    private final Production49_134 production = new Production49_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}