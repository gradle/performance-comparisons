package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_97 {
    private final Production49_97 production = new Production49_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}