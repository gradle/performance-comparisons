package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_93 {
    private final Production49_93 production = new Production49_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}