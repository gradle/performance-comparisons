package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_388 {
    private final Production49_388 production = new Production49_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}