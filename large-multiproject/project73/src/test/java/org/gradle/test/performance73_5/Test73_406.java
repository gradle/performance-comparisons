package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_406 {
    private final Production73_406 production = new Production73_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}