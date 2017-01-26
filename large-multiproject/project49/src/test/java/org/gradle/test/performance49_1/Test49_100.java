package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_100 {
    private final Production49_100 production = new Production49_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}