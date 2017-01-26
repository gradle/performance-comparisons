package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_281 {
    private final Production59_281 production = new Production59_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}