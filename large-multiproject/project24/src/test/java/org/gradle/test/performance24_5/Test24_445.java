package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_445 {
    private final Production24_445 production = new Production24_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}