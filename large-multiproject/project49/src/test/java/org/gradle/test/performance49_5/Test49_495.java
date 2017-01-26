package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_495 {
    private final Production49_495 production = new Production49_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}