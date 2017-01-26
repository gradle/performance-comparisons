package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_147 {
    private final Production59_147 production = new Production59_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}