package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_382 {
    private final Production59_382 production = new Production59_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}