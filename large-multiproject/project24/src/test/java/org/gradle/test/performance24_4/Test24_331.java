package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_331 {
    private final Production24_331 production = new Production24_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}