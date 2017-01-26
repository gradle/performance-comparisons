package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_310 {
    private final Production59_310 production = new Production59_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}