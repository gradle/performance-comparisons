package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_406 {
    private final Production69_406 production = new Production69_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}