package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_305 {
    private final Production59_305 production = new Production59_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}