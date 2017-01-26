package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_215 {
    private final Production59_215 production = new Production59_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}