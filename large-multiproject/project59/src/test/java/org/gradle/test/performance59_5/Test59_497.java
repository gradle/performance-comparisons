package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_497 {
    private final Production59_497 production = new Production59_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}