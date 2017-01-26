package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_406 {
    private final Production24_406 production = new Production24_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}