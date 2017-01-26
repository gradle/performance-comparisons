package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_228 {
    private final Production59_228 production = new Production59_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}