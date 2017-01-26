package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_458 {
    private final Production59_458 production = new Production59_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}