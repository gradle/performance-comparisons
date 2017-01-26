package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_302 {
    private final Production59_302 production = new Production59_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}