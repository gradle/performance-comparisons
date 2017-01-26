package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_72 {
    private final Production49_72 production = new Production49_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}