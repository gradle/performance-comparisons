package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_419 {
    private final Production38_419 production = new Production38_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}