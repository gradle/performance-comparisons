package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_338 {
    private final Production60_338 production = new Production60_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}