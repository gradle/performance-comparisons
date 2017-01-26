package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_27 {
    private final Production24_27 production = new Production24_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}