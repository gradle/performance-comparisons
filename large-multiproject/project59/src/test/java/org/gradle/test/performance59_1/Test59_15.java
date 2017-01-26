package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_15 {
    private final Production59_15 production = new Production59_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}