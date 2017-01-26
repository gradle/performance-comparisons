package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_365 {
    private final Production59_365 production = new Production59_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}