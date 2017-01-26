package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_246 {
    private final Production49_246 production = new Production49_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}