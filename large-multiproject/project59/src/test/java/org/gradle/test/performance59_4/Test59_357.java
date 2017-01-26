package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_357 {
    private final Production59_357 production = new Production59_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}