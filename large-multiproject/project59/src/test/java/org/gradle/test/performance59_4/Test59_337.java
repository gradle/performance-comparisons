package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_337 {
    private final Production59_337 production = new Production59_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}