package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_44 {
    private final Production49_44 production = new Production49_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}