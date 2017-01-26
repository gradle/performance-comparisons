package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_419 {
    private final Production91_419 production = new Production91_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}