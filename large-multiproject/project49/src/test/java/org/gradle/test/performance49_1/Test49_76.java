package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_76 {
    private final Production49_76 production = new Production49_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}