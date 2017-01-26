package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_406 {
    private final Production26_406 production = new Production26_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}