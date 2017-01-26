package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_361 {
    private final Production59_361 production = new Production59_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}