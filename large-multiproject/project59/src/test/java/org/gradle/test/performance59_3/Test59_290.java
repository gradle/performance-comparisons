package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_290 {
    private final Production59_290 production = new Production59_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}