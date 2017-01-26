package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_29 {
    private final Production49_29 production = new Production49_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}