package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_406 {
    private final Production43_406 production = new Production43_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}