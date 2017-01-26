package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_228 {
    private final Production49_228 production = new Production49_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}