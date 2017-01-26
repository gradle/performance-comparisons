package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_406 {
    private final Production49_406 production = new Production49_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}