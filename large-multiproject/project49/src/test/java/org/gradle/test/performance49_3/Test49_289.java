package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_289 {
    private final Production49_289 production = new Production49_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}