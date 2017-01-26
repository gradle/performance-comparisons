package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_406 {
    private final Production45_406 production = new Production45_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}