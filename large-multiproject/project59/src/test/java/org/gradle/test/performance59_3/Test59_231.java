package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_231 {
    private final Production59_231 production = new Production59_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}