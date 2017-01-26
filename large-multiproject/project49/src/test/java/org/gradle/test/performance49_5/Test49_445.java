package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_445 {
    private final Production49_445 production = new Production49_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}