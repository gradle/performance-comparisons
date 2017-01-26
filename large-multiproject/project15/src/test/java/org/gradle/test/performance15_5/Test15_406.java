package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_406 {
    private final Production15_406 production = new Production15_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}