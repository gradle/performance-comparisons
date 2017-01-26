package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_323 {
    private final Production59_323 production = new Production59_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}