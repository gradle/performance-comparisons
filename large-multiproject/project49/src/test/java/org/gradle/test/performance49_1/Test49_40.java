package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_40 {
    private final Production49_40 production = new Production49_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}