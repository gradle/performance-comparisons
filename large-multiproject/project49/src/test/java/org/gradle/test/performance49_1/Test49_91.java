package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_91 {
    private final Production49_91 production = new Production49_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}