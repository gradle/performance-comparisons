package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_45 {
    private final Production24_45 production = new Production24_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}