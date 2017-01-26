package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_286 {
    private final Production59_286 production = new Production59_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}