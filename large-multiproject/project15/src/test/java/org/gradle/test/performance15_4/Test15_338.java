package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_338 {
    private final Production15_338 production = new Production15_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}