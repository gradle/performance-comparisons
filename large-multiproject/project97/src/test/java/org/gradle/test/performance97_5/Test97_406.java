package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_406 {
    private final Production97_406 production = new Production97_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}