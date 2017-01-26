package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_77 {
    private final Production24_77 production = new Production24_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}