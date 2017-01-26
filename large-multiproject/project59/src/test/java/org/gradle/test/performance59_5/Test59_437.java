package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_437 {
    private final Production59_437 production = new Production59_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}