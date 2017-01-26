package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_406 {
    private final Production44_406 production = new Production44_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}