package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_331 {
    private final Production49_331 production = new Production49_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}